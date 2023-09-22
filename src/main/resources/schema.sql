-- Create the User table
CREATE TABLE UserTable (
    UserID INT AUTO_INCREMENT PRIMARY KEY,
    Role VARCHAR(255) DEFAULT 'Client',
    Name VARCHAR(255) NOT NULL,
    Age INT,
    PhoneNo BIGINT,
    Gender VARCHAR(255),
    JobRole VARCHAR(255),
    Email VARCHAR(255),
    CV VARCHAR(255)
);

-- Create the Consultant Req table
CREATE TABLE ConsultantReq (
    RequestID INT AUTO_INCREMENT PRIMARY KEY,
    UserID INT,
    Status VARCHAR(255) DEFAULT 'Pending',
    FOREIGN KEY (UserID) REFERENCES UserTable(UserID)
);

-- Create the Consultant table
CREATE TABLE Consultant (
    ConsultantID INT AUTO_INCREMENT PRIMARY KEY,
    UserID INT,
    FOREIGN KEY (UserID) REFERENCES UserTable(UserID)
);
