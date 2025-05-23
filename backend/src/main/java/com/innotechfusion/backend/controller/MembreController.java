package com.innotechfusion.backend.controller;

import com.innotechfusion.backend.entity.Membre;
import com.innotechfusion.backend.repository.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/membres")
public class MembreController {

    @Autowired
    private MembreRepository membreRepository;

    @GetMapping
    public List<Membre> getAllMembres() {
        return membreRepository.findAll();
    }

    @PostMapping("/{id}/vote")
    public ResponseEntity<?> vote(@PathVariable Long id) {
        Optional<Membre> membre = membreRepository.findById(id);
        if (membre.isPresent() && !membre.get().isAVote()) {
            membre.get().setAVote(true);
            membreRepository.save(membre.get());
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().body("Déjà voté ou inexistant");
    }
}
