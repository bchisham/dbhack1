<?php
/*  $library = simplexml_load_file('book.xml');
  foreach ($library->shelf as $shelf) {
      printf("Shelf %s\n", $shelf['id']);
      foreach ($shelf->book as $book) {
          printf("Title: %s\n", $book->title);
          printf("Author: %s\n", $book->author);
      }
  } */

  $nex = simplexml_load_file('52.xml');
//print_r($nex);
  foreach ($nex->otus->otu as $otu) {
      printf("Label %s\n", $otu['label']);


  }


  ?>