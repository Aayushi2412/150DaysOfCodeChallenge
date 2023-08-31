int[] arr = new int[n + 1];
        for(int i = 0; i < ranges.length; i++) {
            if(ranges[i] == 0) continue;
            int left = Math.max(0, i - ranges[i]);
            arr[left] = Math.max(arr[left], i + ranges[i]);
        }
		
		// same part like previous problem
        int end = 0, farCanReach = 0, cnt = 0;        
        for(int i = 0; i < arr.length && end < n; end = farCanReach) {
            cnt++;
            while(i < arr.length && i <= end) {
                farCanReach = Math.max(farCanReach, arr[i++]);                            
            }
            if(end == farCanReach) return -1; 
        }
        return cnt;
