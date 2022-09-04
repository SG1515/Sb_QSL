package com.ll.exam.qsl.user.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor //생성자가 만들어짐 (기본생성자 X)
@NoArgsConstructor //인자없는 생성자 허용
@Builder
public class SiteUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    @Column(unique = true)
    private String email;
}
