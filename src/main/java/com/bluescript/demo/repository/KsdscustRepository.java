package com.bluescript.demo.repository;

import javax.transaction.Transactional;

import com.bluescript.demo.entity.ksdsCustEntity;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface KsdscustRepository extends JpaRepository<ksdsCustEntity, Long> {

}