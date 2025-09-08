package org.msait.fastType.main;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MainEntityDto {

    Long id;
    @NotBlank(message = "نام انگشت الزامی است")
    @Size(min = 4, message = "نام انگشت باید حداقل 4 کاراکتر باشد")
    String finger;
    @NotBlank(message = "نام دست الزامی است")
    @Size(min = 4, message = "نام دست باید حداقل 4 کاراکتر باشد")
    String hand;
    @NotBlank(message = "کد اسکی الزامی است")
    @Size(min = 4, message = "کد اسکی باید حداقل 1 کاراکتر باشد")
    String ascii;
    Integer character;
}
