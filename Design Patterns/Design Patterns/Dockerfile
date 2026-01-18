# Use official OpenJDK image as base
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy all source files
COPY . /app

# Compile all Java files in their respective directories
# This compiles each directory's Java files independently
RUN find . -type d -exec sh -c 'cd "{}" && [ -n "$(find . -maxdepth 1 -name "*.java" -type f)" ] && javac *.java 2>/dev/null || true' \;

# Set the default command
CMD ["sh", "-c", "echo 'Java Design Patterns Project' && echo 'To run a specific pattern, use:' && echo 'docker run <image> sh -c \"cd <pattern-directory> && java <ClassName>\"'"]
