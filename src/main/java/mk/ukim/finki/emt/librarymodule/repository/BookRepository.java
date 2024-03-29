package mk.ukim.finki.emt.librarymodule.repository;

import mk.ukim.finki.emt.librarymodule.model.Book;
import mk.ukim.finki.emt.librarymodule.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Page<Book> findAll(Pageable pageable);

    List<Book> findAllByCategory(Category category);

}
