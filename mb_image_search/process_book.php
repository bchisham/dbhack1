<?php
  $doc = new domDocument();
  $doc->load('book.xml');

  $library = $doc->documentElement;
  $shelves = $library->childNodes;

  foreach ($shelves as $shelf) {
     if ($shelf instanceof domElement) {
          process_shelf($shelf);
     }
  }

  function process_shelf($shelf)
  {  
      printf("Shelf %s\n", $shelf->getAttribute('id'));

      $books = $shelf->childNodes;
      foreach ($books as $book) {
          if ($book instanceof domElement) {
              process_book($book);
          }
      }
  }

  function process_book($book)
  {
      foreach ($book->childNodes as $child) {
          if (! ($child instanceof domElement)) {
              continue;
          }

          foreach($child->childNodes as $element) {
              $content = trim($element->nodeValue);

              switch ($child->tagName) {
              case 'title':
                  printf("Title: %s\n", $content);
                  break;
              case 'author':
                  printf("Author: %s\n", $content);
                  break;

              }
          }
      }
  }
  ?>