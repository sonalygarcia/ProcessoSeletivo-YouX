package com.example.demo.services;

import com.example.demo.models.Paciente;
import com.example.demo.repository.PacienteRepository;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> findAll(){
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> findById(Long id){
        return pacienteRepository.findById(id);
    }

    public Paciente save(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    public void deleteById(Long id){
        pacienteRepository.deleteById(id);
    }

    public String criptografarCPF(String cpf) {
        return Base64.encodeBase64String(cpf.getBytes());
    }

}