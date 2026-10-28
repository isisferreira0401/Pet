package com.seduc2.pet.service;

import com.seduc2.pet.entity.Animal;
import com.seduc2.pet.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }

    public List<Animal> mostrarAnimais(){
        List<Animal> animalList = new ArrayList<>();
        return animalList = repository.findAll();
    }

    public void cadatrarAnimal(Animal animation){
        Animal animal = new Animal();
        animal.setNome(animation.getNome());
        animal.setCastrado(animation.isCastrado());
        animal.setEspecie(animation.getEspecie());
        animal.setRaca(animation.getRaca());
        animal.setSexo(animation.getSexo());
        animal.setDataNascimento(animation.getDataNascimento());
        animal.setPeso(animation.getPeso());
        animal.setCor(animation.getCor());
        animal.setVacinacao(animation.getVacinacao());
        animal.setObservacoes(animation.getObservacoes());
        repository.save(animal);

    }
}
