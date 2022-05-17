cosnt TwoSum = (array, target) = > {
	const map = {};

	for(let i = 0; i < array.length; i++){
		let complemet = target - array[i];

		if(map.hasOwnProperty(complement))
			return [map[complement],i]

		map[array[i]] = i;
	}
	return null;
};