-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2024 at 03:05 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `evaluation`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `fullname` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `fullname`, `email`, `password`) VALUES
(1, 'Mark Gen Bernabe', 'gem@gmail.com', '12345'),
(2, 'jhghjf', 'good@gmail.com', '12345'),
(3, 'Mark Gem Bernabe', 'markgembernabe@gmail.com', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `evaluations`
--

CREATE TABLE `evaluations` (
  `id` int(11) NOT NULL,
  `evaluator` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `yearlevel` varchar(255) DEFAULT NULL,
  `instructor` varchar(255) DEFAULT NULL,
  `semester` varchar(255) DEFAULT NULL,
  `a1` varchar(11) DEFAULT NULL,
  `a2` varchar(11) DEFAULT NULL,
  `a3` varchar(11) DEFAULT NULL,
  `a4` varchar(11) DEFAULT NULL,
  `a5` varchar(11) DEFAULT NULL,
  `atotal` float DEFAULT NULL,
  `b1` varchar(255) NOT NULL,
  `b2` varchar(255) NOT NULL,
  `b3` varchar(255) NOT NULL,
  `b4` varchar(255) NOT NULL,
  `b5` varchar(255) NOT NULL,
  `btotal` float DEFAULT NULL,
  `c1` varchar(255) NOT NULL,
  `c2` varchar(255) NOT NULL,
  `c3` varchar(255) NOT NULL,
  `c4` varchar(255) NOT NULL,
  `c5` varchar(255) NOT NULL,
  `ctotal` float DEFAULT NULL,
  `d1` varchar(255) NOT NULL,
  `d2` varchar(255) NOT NULL,
  `d3` varchar(255) NOT NULL,
  `d4` varchar(255) NOT NULL,
  `d5` varchar(255) NOT NULL,
  `dtotal` float DEFAULT NULL,
  `percentage` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `evaluations`
--

INSERT INTO `evaluations` (`id`, `evaluator`, `status`, `yearlevel`, `instructor`, `semester`, `a1`, `a2`, `a3`, `a4`, `a5`, `atotal`, `b1`, `b2`, `b3`, `b4`, `b5`, `btotal`, `c1`, `c2`, `c3`, `c4`, `c5`, `ctotal`, `d1`, `d2`, `d3`, `d4`, `d5`, `dtotal`, `percentage`) VALUES
(8, 'Reiner Palarca', 'Student', '1st Year', 'Christian C. Roxas', 'First Semester', '4', '5', '2', '2', '5', 3, '5', '5', '3', '5', '5', 4, '3', '4', '5', '1', '5', 3, '5', '3', '5', '5', '5', 4, 3.5),
(9, 'MART ANGELO MARTINEZ', 'Student', '3rd Year', 'Don Sean Arvie V. Buencamino', 'Second Semester', '5', '5', '3', '5', '5', 4.6, '5', '3', '1', '5', '5', 3.8, '3', '5', '4', '5', '5', 4.4, '1', '5', '5', '5', '5', 4.2, 4.25),
(10, 'Mark Gem Bernabe', 'Student', '3rd Year', 'Christian C. Roxas', 'Second Semester', '1', '1', '1', '1', '1', 1, '1', '1', '1', '1', '1', 1, '1', '1', '1', '1', '1', 1, '1', '1', '1', '1', '1', 1, 1),
(11, 'Mart Angelo Martinez', 'Student', '3rd Year', 'Don Sean Arvie V. Buencamino', 'Second Semester', '5', '5', '3', '5', '5', 4.6, '5', '3', '1', '5', '5', 3.8, '3', '5', '4', '5', '5', 4.4, '1', '5', '5', '5', '5', 4.2, 4.25),
(13, 'Gem Bernabe', 'Student', '4th Year', 'Dr. Mayreen V. Amazona', 'First Semester', '5', '5', '5', '5', '5', 5, '5', '5', '5', '5', '5', 5, '5', '5', '5', '5', '5', 5, '5', '5', '5', '5', '5', 5, 5),
(15, 'Allod Jakol', 'Student', '5th Year', 'Christian C. Roxas', 'First Semester', '1', '1', '1', '1', '1', 1, '2', '2', '2', '2', '2', 2, '3', '3', '3', '3', '3', 3, '5', '5', '5', '5', '5', 5, 2.75),
(16, 'Dr. Mayreen V. Amazona', 'Self', ' ', 'Dr. Mayreen V. Amazona', 'First Semester', '5', '5', '5', '5', '5', 5, '5', '5', '5', '5', '5', 5, '5', '5', '5', '5', '5', 5, '5', '5', '5', '5', '5', 5, 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `evaluations`
--
ALTER TABLE `evaluations`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `evaluations`
--
ALTER TABLE `evaluations`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
