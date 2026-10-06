def call(String fileName) {
    if (fileExists(fileName)) {
        echo "${fileName} exists."
        return true
    } else {
        echo "${fileName} does not exist."
        return false
    }
}
