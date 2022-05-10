//package com.hgu.library.service;
//
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.ArrayList;
//
//@AllArgsConstructor
//@Service
//public class BookService {
//    private BookRepository bookRepository;
//
//    @Transactional
//    public List<BookDto> getBoardlist() {
//        List<BookEntity> bookEntities = bookRepository.findAll();
//        List<BookDto> bookDtoList = new ArrayList<>();
//
//        for ( BookEntity boardEntity : bookEntities) {
//            BookDto boardDTO = BookDto.builder()
//                    .id(boardEntity.getId())
//                    .build();
//
//            bookDtoList.add(boardDTO);
//        }
//
//        return bookDtoList;
//    }
//}
