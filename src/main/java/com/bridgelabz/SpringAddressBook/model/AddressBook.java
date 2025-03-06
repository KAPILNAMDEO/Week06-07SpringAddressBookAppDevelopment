package com.bridgelabz.SpringAddressBook.model;





import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ADDRESSBOOK")
public class AddressBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @NotEmpty(message = "Phone number cannot be empty")
    private String phoneNumber;

    @NotEmpty(message = "email cannot be empty")
    private String email;

    @NotEmpty(message = "address cannot be empty")
    private String address;

    // New fields
    @NotEmpty(message = "City cannot be empty")
    private String city;

    @NotEmpty(message = "State cannot be empty")
    private String state;

    @NotEmpty(message = "Zipcode cannot be empty")
    private String zipcode;
}

