package com.bridgelabz.SpringAddressBook.controller;





import com.bridgelabz.SpringAddressBook.dto.AddressBookDTO;
import com.bridgelabz.SpringAddressBook.model.AddressBook;
import com.bridgelabz.SpringAddressBook.service.AddressBookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @Autowired
    private AddressBookService service;

    @PostMapping("/add")
    public ResponseEntity<AddressBook> addEntry(@Valid @RequestBody AddressBookDTO addressBookDTO) {
        return ResponseEntity.ok(service.saveEntry(addressBookDTO));
    }

    @GetMapping("/all")
    public ResponseEntity<List<AddressBook>> getAllEntries() {
        return ResponseEntity.ok(service.getAllEntries());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<AddressBook> getEntryById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getEntryById(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<AddressBook> updateEntry(@PathVariable Long id, @Valid @RequestBody AddressBookDTO newEntry) {
        return ResponseEntity.ok(service.updateAddressBook(id, newEntry));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEntry(@PathVariable Long id) {
        service.deleteEntry(id);
        return ResponseEntity.ok().build();
    }
}