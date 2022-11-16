package com.example.project.bookmyshowbackend.dto;


import com.sun.istack.NotNull;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    int id;

    @NotNull
    String name;

    @NotNull
    String mobileNo;
}
