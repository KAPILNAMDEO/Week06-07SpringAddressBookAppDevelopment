package com.bridgelabz.SpringAddressBook.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressBookDTO {

    @NotBlank(message = "Name is required") // Ensures the field is not empty
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Name must start with a capital letter and be at least 3 characters long")
    private String name;

    @NotEmpty(message = "phonenumber cannot be empty")
    private String phoneNumber;

    @NotEmpty(message = "email cannot be empty")
    private String email;

    @NotEmpty(message = "address cannot be empty")
    private String address;

    // New fields
    @NotBlank(message = "City is required")
    private String city;

    @NotBlank(message = "State is required")
    private String state;

    @NotBlank(message = "Zipcode is required")
    private String zipcode;
}
