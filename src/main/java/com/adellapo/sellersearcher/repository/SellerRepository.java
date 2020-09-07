package com.adellapo.sellersearcher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adellapo.sellersearcher.domain.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
