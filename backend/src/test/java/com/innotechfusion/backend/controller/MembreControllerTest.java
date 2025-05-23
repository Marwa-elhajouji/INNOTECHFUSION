package com.innotechfusion.backend.controller;

import com.innotechfusion.backend.entity.Membre;
import com.innotechfusion.backend.repository.MembreRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.Arrays;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(MembreController.class)
public class MembreControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MembreRepository membreRepository;

    @Test
    public void testGetAllMembres() throws Exception {
        Membre m1 = new Membre();
        m1.setNom("Alice");
        m1.setPrenom("Dupont");
        m1.setDateNaissance(LocalDate.of(1990, 5, 12));
        m1.setAVote(false);

        Mockito.when(membreRepository.findAll()).thenReturn(Arrays.asList(m1));

        mockMvc.perform(get("/membres"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nom").value("Alice"));
    }
}
