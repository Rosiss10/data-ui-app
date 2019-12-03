package com.cipher.datauiapp.services;

import com.cipher.datauiapp.Repository.NationalityRepository;
import com.cipher.datauiapp.models.Nationality;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NationalityService {

    @Autowired
    private NationalityRepository nationalityRepository;

    /**afficher la liste des nationalitées*/
    public List<Nationality> getNationalities()
    {
      return (List<Nationality>)  nationalityRepository.findAll();
    }

    /**Selectionner une Nationalité en fonction de son ID*/
    public Optional<Nationality> getNationalityById(Integer Id)
    {
        return nationalityRepository.findById(Id);
    }

    /**Ajouter une nationalité */
    public void addNationality(Nationality nationality)
    {
        nationalityRepository.save(nationality);
    }

    /**Modifier  une nationalité*/
    public void updateNationality(Nationality nationality)
    {
        nationalityRepository.save(nationality);
    }

    /**supprimer une nationalité une Nationalité*/
    public void deleteNationality(Integer Id)
    {
        nationalityRepository.deleteById(Id);
    }


}
