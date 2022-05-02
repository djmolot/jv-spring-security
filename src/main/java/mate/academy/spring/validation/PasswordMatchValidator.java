package mate.academy.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mate.academy.spring.dto.request.UserRequestDto;

public class PasswordMatchValidator implements ConstraintValidator<PasswordMatch, UserRequestDto> {

    @Override
    public boolean isValid(UserRequestDto userRequestDto,
                           ConstraintValidatorContext constraintValidatorContext) {
        String plainPassword = userRequestDto.getPassword();
        String repeatPassword = userRequestDto.getRepeatPassword();
        return plainPassword != null && plainPassword.equals(repeatPassword);
    }
}