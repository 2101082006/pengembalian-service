/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibra.pengembalian.repository;

import com.ibra.pengembalian.entity.Pengembalian;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author LENOVO
 */
public interface PengembalianRepository extends JpaRepository<Pengembalian, Long>{
        public Pengembalian findByPengembalianId(Long kembaliId);
}
