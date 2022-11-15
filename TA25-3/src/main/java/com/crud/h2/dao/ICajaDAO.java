package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Caja;

public interface ICajaDAO extends JpaRepository<Caja, String> {

}
