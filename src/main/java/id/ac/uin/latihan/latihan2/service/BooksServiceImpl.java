package id.ac.uin.latihan.latihan2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.ac.uin.latihan.latihan2.entity.Books;
import id.ac.uin.latihan.latihan2.repository.BooksRepository;

@Service
public class BooksServiceImpl implements BooksService {
  private final BooksRepository booksRepository;

  @Autowired
  public BooksServiceImpl(BooksRepository booksRepository) {
    this.booksRepository = booksRepository;
  }

  @Override
  public List<Books> getAllBooks() {
    return booksRepository.findAll();
  }

  @Override
  public Optional<Books> findById(Long id) {
    return booksRepository.findById(id);
  }

  @Override
  public Optional<Books> findByAuthor(String author) {
    return booksRepository.findByAuthor(author);
  }

  @Override
  public Books save(Books std) {
    return booksRepository.save(std);
  }

  @Override
  public void deleteById(Long id) {
    booksRepository.deleteById(id);
  }

}
