#/bin/bash
test `curl 'http://localhost:8765/sum?a=5&b=10'` -eq 15
test `curl 'http://localhost:8765/multiply?a=5&b=10'` -eq 50
