package id.ac.uin.latihan.latihan2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import id.ac.uin.latihan.latihan2.entity.Books;

public interface BooksRepository extends JpaRepository<Books, Long> {

  // Query Method
  Optional<Books> findByAuthor(String author);
}
