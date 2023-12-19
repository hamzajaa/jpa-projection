package com.example.jpaprojection.dao;

import com.example.jpaprojection.bean.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDao extends JpaRepository<Address, Long> {
}
