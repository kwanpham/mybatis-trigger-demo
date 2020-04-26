CREATE TABLE `customer`
(
    `id`          INT(11)     NOT NULL AUTO_INCREMENT,
    `name`        VARCHAR(50) NOT NULL DEFAULT '',
    `create_date` DATE        NOT NULL,
    `phone`       VARCHAR(50) NOT NULL DEFAULT '',
    `email`       VARCHAR(50) NOT NULL DEFAULT '',
    PRIMARY KEY (`id`),
    UNIQUE INDEX `phone` (`phone`),
    UNIQUE INDEX `email` (`email`)
)
    ENGINE = InnoDB
;
