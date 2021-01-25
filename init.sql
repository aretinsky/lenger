--
-- `task` table
--

CREATE TABLE `task`
(
    `id`            INT AUTO_INCREMENT PRIMARY KEY,
    `title`         VARCHAR(100) NOT NULL,
    `author`        VARCHAR(30)  NOT NULL,
    `task`          TEXT         NOT NULL,
    `solution`      VARCHAR(255) NOT NULL,
    `success_count` INT           DEFAULT 0,
    `attempts`      INT           DEFAULT 0,
    `difficult`     DECIMAL(5, 1) DEFAULT 5.0
) ENGINE = INNODB;


--
-- Dumping data for `task` table
--
INSERT INTO `task`(`id`, `title`, `author`, `task`, `solution`, `success_count`, `attempts`, `difficult`)
VALUES (NULL, 'a + b', 'Victor Aretinsky', 'Требуется сложить два целых числа А и В.',
        'https://github.com/php1995/lenger-tasks/edit/main/beginner/sum.py', 28, 30, 2.1);

INSERT INTO `task`(`id`, `title`, `author`, `task`, `solution`, `success_count`, `attempts`, `difficult`)
VALUES (NULL, 'НОД', 'Victor Aretinsky', 'Наибольший общий делитель
Вводится два целых числа, находится их наибольший общий делитель.

Примечание. Наибольший общий делитель (НОД, англ. GCD) - это наибольшее число, на которое нацело делятся два заданных числа. ',
        'https://github.com/php1995/lenger-tasks/blob/main/beginner/gcd.py', 10, 12, 3.4);

