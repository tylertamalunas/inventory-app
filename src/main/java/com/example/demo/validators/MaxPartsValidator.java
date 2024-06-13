package com.example.demo.validators;

import com.example.demo.domain.Part;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MaxPartsValidator implements ConstraintValidator<ValidMaxParts, Integer> {

    Part validator = new Part() {
        @Override
        public boolean isValidInv() {
            return super.isValidInv();
        }
    };

    @Override
    public void initialize(ValidMaxParts maxInv) {

    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return value != null && value <= validator.getMaxInv();
    }
}
