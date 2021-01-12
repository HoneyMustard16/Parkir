-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 25, 2019 at 11:22 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `data_parkir`
--

-- --------------------------------------------------------

--
-- Table structure for table `data`
--

CREATE TABLE `data` (
  `no_tiket` int(15) NOT NULL,
  `no_pol` varchar(15) NOT NULL,
  `jenis` enum('Mobil','Motor') NOT NULL,
  `tgl_masuk` date NOT NULL,
  `tgl_keluar` date DEFAULT NULL,
  `jam_masuk` time NOT NULL,
  `jam_keluar` time DEFAULT NULL,
  `biaya` int(15) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data`
--

INSERT INTO `data` (`no_tiket`, `no_pol`, `jenis`, `tgl_masuk`, `tgl_keluar`, `jam_masuk`, `jam_keluar`, `biaya`) VALUES
(3, 'B 1181 EFY', 'Mobil', '2019-04-22', '2019-08-23', '16:26:08', '20:16:22', 620000),
(4, 'B 16 DC', 'Mobil', '2019-04-22', '2019-04-22', '16:29:07', '17:12:30', 6000),
(5, 'B 99 CD', 'Mobil', '2019-04-22', '2019-08-23', '16:32:57', '20:16:12', 620000),
(6, 'B 2624 XX', 'Mobil', '2019-04-22', '2019-08-23', '16:35:39', '20:16:01', 620000),
(7, 'B 1221 AC', 'Motor', '2019-04-22', '2019-08-23', '16:44:13', '20:15:38', 617000),
(8, 'B222C', 'Motor', '2019-04-22', '2019-04-22', '17:05:28', '17:33:25', 2000),
(9, 'B 333 EFF', 'Motor', '2019-04-22', '2019-08-23', '17:10:21', '20:15:09', 617000),
(10, 'B 2500 U ', 'Mobil', '2019-08-23', '2019-09-18', '20:16:30', '18:12:38', 135000),
(11, 'B 1616 U', 'Motor', '2019-09-23', '2019-09-23', '08:42:41', '08:42:48', 2000),
(17, 'B 2500 U', 'Mobil', '2019-11-25', NULL, '14:44:04', NULL, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data`
--
ALTER TABLE `data`
  ADD PRIMARY KEY (`no_tiket`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data`
--
ALTER TABLE `data`
  MODIFY `no_tiket` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
