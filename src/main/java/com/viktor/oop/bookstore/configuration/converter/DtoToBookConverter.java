package com.viktor.oop.bookstore.configuration.converter;

import lombok.RequiredArgsConstructor;
import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;
import org.springframework.stereotype.Component;

import com.viktor.oop.bookstore.dto.BookDto;
import com.viktor.oop.bookstore.model.Book;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class DtoToBookConverter implements Converter<BookDto, Book> {
    @Override
    public Book convert(MappingContext<BookDto, Book> mappingContext) {
        BookDto source = mappingContext.getSource();
        return new Book(UUID.randomUUID(), source.getTitle(), source.getAuthor(), source.getYearPublished());
    }
}
