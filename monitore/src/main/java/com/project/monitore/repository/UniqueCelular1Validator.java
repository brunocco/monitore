package com.project.monitore.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.monitore.entity.Cadastro;
import com.project.monitore.entity.UniqueCelular1;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class UniqueCelular1Validator implements ConstraintValidator<UniqueCelular1, String> {

    @Autowired CadastroRepository cadastroRepository;

    @Override
    public boolean isValid(String celular1, ConstraintValidatorContext context) {
        return !cadastroRepository.existsByCelular1(celular1);
    }
}
