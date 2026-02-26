def find_smallest(array):
    smallest = array[0]
    smallest_index = 0
    for i in range(1, len(array)):
        if array[i] < smallest:
            smallest = array[i]
            smallest_index = i

    return smallest, smallest_index


def main():
    array = [1, 5, 2, 5, 6, 432, 45, 6, 9, -23, -4213, -423]
    print(array)

    for i in range(len(array) - 1):
        _, idx_smallest = find_smallest(array)
        array[i], array[idx_smallest] = array[idx_smallest], array[i]


if __name__ == "__main__":
    main()
