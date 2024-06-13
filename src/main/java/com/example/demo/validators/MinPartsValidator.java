package com.example.demo.validators;

import com.example.demo.domain.Part;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MinPartsValidator implements ConstraintValidator<ValidMinParts, Integer> {

    Part validator = new Part() {
        @Override
        public boolean isValidInv() {
            return super.isValidInv();
        }
    };

    @Override
    public void initialize(ValidMinParts maxInv) {

    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return value != null && value >= validator.getMinInv();
    }
}
