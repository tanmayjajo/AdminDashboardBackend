
-- Insert sample data into UserTable
INSERT INTO UserTable (Name, Age, PhoneNo, Gender, JobRole, Email, CV)
VALUES
    ('John Doe', 25, 1234567890, 'Male', 'Software Engineer', 'john.doe@example.com', 'john_doe_cv.pdf'),
    ('Alice Smith', 28, 9876543210, 'Female', 'Data Analyst', 'alice.smith@example.com', 'alice_smith_cv.pdf'),
    ('Bob Johnson', 30, 5555555555, 'Male', 'Project Manager', 'bob.johnson@example.com', 'bob_johnson_cv.pdf'),
    ('Eva Wilson', 24, 3333333333, 'Female', 'UX Designer', 'eva.wilson@example.com', 'eva_wilson_cv.pdf'),
    ('Mike Brown', 27, 6666666666, 'Male', 'QA Engineer', 'mike.brown@example.com', 'mike_brown_cv.pdf'),
    ('Sarah Green', 29, 4444444444, 'Female', 'Marketing Specialist', 'sarah.green@example.com', 'sarah_green_cv.pdf'),
    ('Daniel Lee', 26, 7777777777, 'Male', 'DevOps Engineer', 'daniel.lee@example.com', 'daniel_lee_cv.pdf'),
    ('Emily Davis', 23, 2222222222, 'Female', 'Web Developer', 'emily.davis@example.com', 'emily_davis_cv.pdf'),
    ('Chris Evans', 31, 9999999999, 'Male', 'Product Manager', 'chris.evans@example.com', 'chris_evans_cv.pdf'),
    ('Linda White', 28, 6661112222, 'Female', 'Business Analyst', 'linda.white@example.com', 'linda_white_cv.pdf');

-- Insert sample data into ConsultantReq
INSERT INTO ConsultantReq (UserID, Status)
VALUES
    (1, 'Approved'),
    (2, 'Pending'),
    (3, 'Rejected'),
    (4, 'Pending'),
    (5, 'Pending'),
    (6, 'Approved'),
    (7, 'Pending'),
    (8, 'Rejected'),
    (9, 'Pending'),
    (10, 'Pending');

-- Insert sample data into Consultant
INSERT INTO Consultant (UserID)
VALUES
    (1),
    (2),
    (7),
    (9);
