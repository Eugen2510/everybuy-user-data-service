package com.everybuy.routing.model.dto;

import com.everybuy.database.entity.User;

import java.util.Set;
import java.util.stream.Collectors;

public record UserDTO(String fullName,
                      String email,
                      String phone,
                      boolean isBlock,
                      Set<RoleDTO> roleDTOSet) {
}
