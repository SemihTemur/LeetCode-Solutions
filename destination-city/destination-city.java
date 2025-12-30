class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> desCity = new HashSet<>();
        String desCitys = "";
        for(List<String> list: paths){
            desCity.add(list.get(0));
        }

        for(List<String> list: paths){
            if(!desCity.contains(list.get(1))){
                desCitys =  list.get(1);
            };
        }

        return desCitys;
    }
}