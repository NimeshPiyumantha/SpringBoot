package com.supermarket.out.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
        private String id;
        private String name;
        private String address;
        private double salary;

}
