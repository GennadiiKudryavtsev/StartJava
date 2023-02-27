\echo -- select only
    SELECT * FROM Jaegers;

\echo -- select Active
    SELECT * FROM Jaegers  WHERE status = 'Active';

\echo -- select Mark-1, Mark-4
    SELECT *  FROM Jaegers WHERE mark IN ('Mark-1', 'Mark-4');

\echo -- select except Mark-1, Mark-4
    SELECT *  FROM Jaegers WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo -- select in descending order
    SELECT * FROM Jaegers ORDER BY mark DESC;

\echo -- select min launch
    SELECT * FROM Jaegers WHERE launch = (SELECT MIN (launch) FROM Jaegers);

\echo -- select max launch
    SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MAX (kaijuKill) FROM Jaegers);

\echo -- select average
    SELECT AVG(weight) as avg FROM Jaegers;

\echo -- update kaijukill + 1
    UPDATE Jaegers SET kaijukill = kaijukill + 1 WHERE status = 'Active';

\echo -- delete Dont active
    DELETE FROM Jaegers WHERE status = 'Dont active';