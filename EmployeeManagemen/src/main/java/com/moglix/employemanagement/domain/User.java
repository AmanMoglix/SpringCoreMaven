package com.moglix.employemanagement.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class User {
private Long userId;
//ManyToOne
private Long roleId;
private String userName;
private String email;
private String userPassword;
}
