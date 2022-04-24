package id.ac.uin.latihan.latihan2.service;

import java.util.List;
import java.util.Optional;

import id.ac.uin.latihan.latihan2.entity.Books;

public interface BooksService {
  List<Books> getAllBooks();

  Optional<Books> findById(Long id);

  Optional<Books> findByAuthor(String author);

  Books save(Books std);

  void deleteById(Long id);
}
