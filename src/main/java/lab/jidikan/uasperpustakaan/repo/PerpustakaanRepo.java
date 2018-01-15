/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.jidikan.uasperpustakaan.repo;

import lab.jidikan.uasperpustakaan.entity.Perpustakaan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jidikan
 */
@Repository
public interface PerpustakaanRepo extends JpaRepository<Perpustakaan, Integer> {
    
}
