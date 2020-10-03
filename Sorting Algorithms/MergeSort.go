package main

import (
	"fmt"
	"math/rand"
	"time"
)

func genRandomArray(length int, max int) *[]int {
	sl := make([]int, length)
	for i := 0; i < length; i++ {
		rand.Seed(time.Now().UnixNano())
		sl[i] = rand.Intn(max)
	}
	return &sl
}

func merge(sl *[]int, s, m, e int) {
	left := make([]int, m-s+1)
	right := make([]int, e-m)
	copy(left, (*sl)[s:m+1])
	copy(right, (*sl)[m+1:e+1])
	p := s
	for len(left) > 0 && len(right) > 0 {
		if left[0] < right[0] {
			(*sl)[p] = left[0]
			left = left[1:]
		} else {
			(*sl)[p] = right[0]
			right = right[1:]
		}
		p++
	}
	for _, v := range right {
		(*sl)[p] = v
		right = right[:1]
		p++
	}
	for _, v := range left {
		(*sl)[p] = v
		left = left[:1]
		p++
	}
}

func mergeSort(sl *[]int, s, e int) {
	if s < e {
		m := (s + e - 1) / 2
		mergeSort(sl, s, m)
		mergeSort(sl, m+1, e)
		merge(sl, s, m, e)
	}
}

func MergeSort(sl *[]int) {
	mergeSort(sl, 0, len(*sl)-1)
}

func main() {
	mySlice := genRandomArray(100, 1000) // Generates Random Array
	MergeSort(mySlice)
	fmt.Println(*mySlice)
}
