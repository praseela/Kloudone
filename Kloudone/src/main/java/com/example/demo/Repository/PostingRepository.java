package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Posting;

@Repository
public interface PostingRepository extends JpaRepository<Posting, Integer> {

}
