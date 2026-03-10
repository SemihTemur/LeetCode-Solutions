-- Write your PostgreSQL query statement below
SELECT lb.book_id,title,lb.author,lb.genre,lb.publication_year, lb.total_copies AS current_borrowers 
FROM library_books lb
WHERE lb.total_copies = (
    SELECT COUNT(bd.book_id) FROM borrowing_records bd
    WHERE bd.book_id = lb.book_id AND bd.return_date IS NULL
    GROUP BY bd.book_id
) ORDER BY lb.total_copies DESC ,title ASC