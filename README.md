# UJOBS Backend

UJOBS is an application designed to connect university students with employers. This repository contains the backend of the application, implemented in Java.

## Features

- **Job Posting**: Employers can post jobs, which are then visible to all students.
- **Job Sharing**: Users can share job postings with other users.
- **Post Validation**: Each job post is validated to ensure it meets certain criteria. The content of the post cannot be empty, cannot exceed 5000 characters, and the user ID associated with the post cannot be null.
- **Image Handling**: Each job post may contain image data. The application converts this image data into a Base64 string and prepends it with "data:image/jpeg;base64," to create a data URL that can be used directly in an `<img>` tag in HTML.

## Getting Started

To get a local copy up and running, follow these steps:

1. Clone the repository.
2. Open the project in your preferred IDE (e.g., Visual Studio Code).
3. Run the application.

## Built With

- Java
- Spring Boot
-MySql

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

## License

Distributed under the MIT License. See `LICENSE` for more information.

## Contact

Rodrigo Lopez - rodrigoalt15@gmail.com
