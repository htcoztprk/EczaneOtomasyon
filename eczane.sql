-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 11 Ara 2020, 14:11:53
-- Sunucu sürümü: 10.4.14-MariaDB
-- PHP Sürümü: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `eczane`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `faturaislem`
--

CREATE TABLE `faturaislem` (
  `ilac_no` int(11) NOT NULL,
  `fiyat` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kozmetik`
--

CREATE TABLE `kozmetik` (
  `ilacinadi` varchar(50) DEFAULT NULL,
  `ilacinmarkasi` varchar(50) DEFAULT NULL,
  `ilacintürü` varchar(50) DEFAULT NULL,
  `ilacinkullanimmetni` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `personel`
--

CREATE TABLE `personel` (
  `personeladi` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `personelsoyadi` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `yas` int(11) DEFAULT NULL,
  `telefonno` bigint(20) DEFAULT NULL,
  `tcnumarasi` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `recete`
--

CREATE TABLE `recete` (
  `ilac_no` int(11) DEFAULT NULL,
  `ilac_ad` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fiyat` int(11) DEFAULT NULL,
  `ilac_adet` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ilac_kayit_tarihi` date DEFAULT NULL,
  `ilac_sk_tarihi` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `faturaislem`
--
ALTER TABLE `faturaislem`
  ADD PRIMARY KEY (`ilac_no`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `faturaislem`
--
ALTER TABLE `faturaislem`
  MODIFY `ilac_no` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
