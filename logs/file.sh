#!/bin/bash
# file.sh - Count the number of lines in a log file (excluding warmup)
# ./file.sh <path to log file>

sed '/Iteration\s0/d' $1 | wc -l -