import random


def find_smallest(array, start):
    smallest = array[start]
    smallest_index = start
    for i in range(start + 1, len(array)):
        if array[i] < smallest:
            smallest = array[i]
            smallest_index = i

    return smallest, smallest_index


def generate_random_array(size, min, max):
    randomArray = []
    for _ in range(size):
        randomNumber = random.randint(min, max)
        randomArray.append(randomNumber)

    return randomArray


def selection_sort(array):
    print("\n\nUnsorted array:")
    print(array)
    for i in range(len(array) - 1):
        smallest, idx_smallest = find_smallest(array, i)
        print(f"The smallest number in the {i}th round is {
              smallest} in the {idx_smallest} position")
        array[i], array[idx_smallest] = array[idx_smallest], array[i]
        print("Partially ordered array:")
        print(array)
        print()


    print("\n\nSorted array:")
    print(array)


def main():
    print("Ordering array of size 10")
    selection_sort(generate_random_array(10, 0, 100))

    print("Ordering array of size 100")
    selection_sort(generate_random_array(100, 0, 100))

    print("Ordering array of size 1000")

def full():
    selection_sort(generate_random_array(1000, 0, 1000))

if __name__ == "__main__":
    main()
