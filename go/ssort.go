package main

import (
	"fmt"
	"math/rand"
)

func generateRandomArray(size, max int) []int {
	var randomArray []int
	for range size {
		randomArray = append(randomArray, rand.Intn(max))
	}
	return randomArray
}

func selectionSort(unsorted []int) []int {
	fmt.Println("Unsorted array", unsorted)

	for i := 0; i < len(unsorted)-1; i++ {
		smallestIndex := i

		for j := i + 1; j < len(unsorted); j++ {
			if unsorted[j] < unsorted[smallestIndex] {
				smallestIndex = j
			}
		}

		unsorted[i], unsorted[smallestIndex] = unsorted[smallestIndex], unsorted[i]
	}

	fmt.Printf("\n\nSorted array:%v\n\n", unsorted)
	return unsorted
}

func main() {
	fmt.Println("Sorting array of size 10")
	array := generateRandomArray(10, 100000)
	_ = selectionSort(array)

	fmt.Println("Sorting array of size 100")
	array = generateRandomArray(100, 100000)
	_ = selectionSort(array)

	fmt.Println("Sorting array of size 1000")
	array = generateRandomArray(1000000, 100000)
	_ = selectionSort(array)

}
