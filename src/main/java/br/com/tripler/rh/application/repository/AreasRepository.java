package br.com.tripler.rh.application.repository;

import br.com.tripler.rh.application.model.entity.Areas;
import br.com.tripler.rh.application.model.entity.Setor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AreasRepository extends JpaRepository<Areas, Long> {

}
